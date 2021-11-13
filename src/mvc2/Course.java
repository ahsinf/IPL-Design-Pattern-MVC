/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc2;

/**
 *
 * @author Ahsin Fauzi
 */
public class Course {
    private String name;
    private String id;
    private String category;
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id=id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name=name;
    }
    
    public String getCategory() {
        return category;
    }
    
    public void setCategory(String category) {
        this.category=category;
    }
}

