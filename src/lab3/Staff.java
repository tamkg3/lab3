/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;
import java.io.*;
import java.util.*;
import java.lang.*;
/**
 *
 * @author Dark Magician
 */
public class Staff implements Serializable{
    private String id;
    private String name;
    private int age;
    private float salary;
    private final String ID = "Unkhown";
    private final int AGE = 0;
    public String getID()
    {
        return id;
    }
    public void setID(String id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public float getSalary()
    {
        return salary;
    }
    public void setSalary(float salary)
    {
        this.salary = salary;
    }
    //constructor
    public Staff()
    {
        this.id = ID;
        this.name = ID;
        this.age = AGE;
        this.salary = (float) AGE;
    }
    public Staff(String id, String name, int age, int salary)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    //toString
    @Override
    public String toString()
    {
        return id+"-"+name+"-"+age+"-"+salary+"\n";    
    }
    
    public void input()
    {
        Scanner scan = new Scanner(System.in);
        try{
        System.out.print("Nhap ma nhan vien: ");
        this.id = scan.nextLine();
        System.out.print("Nhap ho ten: ");
        this.name = scan.nextLine();
        do{
        System.out.print("Nhap tuoi: ");
        this.age = Integer.parseInt(scan.nextLine());
        }while(age == 0);
        System.out.print("Nhap luong: ");
        this.salary = Float.parseFloat(scan.nextLine());
        }catch(Exception ex)
        {
            System.out.println(String.format("Exception: "+ex));
        }
    }
}
