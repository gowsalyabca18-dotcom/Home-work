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
public class Adaptor implements Grade
{
     OldMark old;

    public Adaptor(OldMark old) {
        this.old = old;
    }

    
    
    @Override
    public String getGrade()
    {
        int marks = old.getTotalMarks();
        
        if (marks >= 90)
            return "A";
        else if (marks >= 75)
            return "B";
        else if (marks >= 60)
            return "C";
        else if (marks >= 50)
            return "D";
        else
            return "F";

        
    }
    
}
