/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

/**
 *
 * @author teddy
 */
public class Species {

    private String nameSpecie;
    private Category category;

    public Species() {
    }

    public Species(String nameSpecie, Category category) {
        this.nameSpecie = nameSpecie;
        this.category = category;
    }
    

    public String getNameSpecie() {
        return nameSpecie;
    }

    public void setNameSpecie(String nameSpecie) {
        this.nameSpecie = nameSpecie;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    
}
