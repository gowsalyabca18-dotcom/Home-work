/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MarkAdaptor;

/**
 *
 * @author Administrator
 */
public class MarkMain 
{
    public static void main(String[] args)
    {
        OldMark oldSystem = new OldMark(82);

        // Using Adapter
        Grade adapter = new Adaptor(oldSystem);

        System.out.println("Total Marks: " + oldSystem.getTotalMarks());
        System.out.println("Converted Grade: " + adapter.getGrade());

    }
}
