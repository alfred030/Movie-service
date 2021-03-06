package com.galvanize.jokes;

import static com.galvanize.jokes.GenerationType.IDENTITY;

@Entity
@Table(name = "joke")
public class Joke {


    @Id
    @GeneratedValue(strategy = IDENTITY)
    Long id;

    @Column
    JokeCategory category;

    @Column
    String description;

    public Joke () {}

    public Joke(JokeCategory category, String description) {
        this.category = category;
        this.description = description;
    }

    public Joke(Long id, JokeCategory category, String description) {
        this.id = id;
        this.category = category;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public JokeCategory getCategory() {
        return category;
    }

    public void setCategory(JokeCategory category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
