package com.production;

public class Menu {
    private String name;
    private int height;
    private int weight;
    private String[] buttons;

    public Menu()
    {
        buttons = new String[5];
    }

    public String[] getButtons() {
        return this.buttons;
    }
}
