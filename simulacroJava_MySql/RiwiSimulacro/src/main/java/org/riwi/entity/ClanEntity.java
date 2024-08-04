package org.riwi.entity;

public class ClanEntity {
    private int id;
    private String name_clan;

    public ClanEntity(){}

    public ClanEntity(String name_clan) {
        this.name_clan = name_clan;
    }

    public ClanEntity(int id, String name_clan) {
        this.id = id;
        this.name_clan = name_clan;
    }

    public int getId() {
        return this.id;
    }

    public String getName_clan() {
        return this.name_clan;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName_clan(String name_clan) {
        this.name_clan = name_clan;
    }

    @Override
    public String toString() {
        return "Clan {" +
                "id: " + id + " | " +
                ", name_clan: " + name_clan +
                '}' +  "\n" + "\n";
    }
}
