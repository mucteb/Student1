/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author sidhu376
 */
public class Student {
    
    private String name;
    private double GPA;
    private String email;
    private String lastname;
    private String GSM;

    public String getGSM()
    {
        return GSM;
    }

    public void setGSM(String GSM)
    {
        this.GSM = GSM;
    }

    public String getLastname()
    {
        return lastname;
    }

    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email)
    {
        this.email = email;
    }

    /**
     * @return the GPA
     */
    public double getGPA()
    {
        return GPA;
    }

    /**
     * @param GPA the GPA to set
     */
    public void setGPA(double GPA)
    {
        this.GPA = GPA;
    }

}
 
   