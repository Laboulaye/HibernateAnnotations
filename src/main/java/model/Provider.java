package model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "providers")
public class Provider {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    //Таблица items связана с таблицей providers через промежуточную таблицу items_providers.
    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    //@joinColumns определяет внешний ключ к таблице, на которую мапится текущий класс Provider
    //@inverseJoinColumns определяет внешний ключ для таблицы, на которую мапится класс Item
    @JoinTable(name = "items_providers",
                joinColumns = {@JoinColumn(name = "provider_id")},
                inverseJoinColumns = {@JoinColumn(name = "item_id")})
    private Set<Item> items;

    public Provider() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }
}
