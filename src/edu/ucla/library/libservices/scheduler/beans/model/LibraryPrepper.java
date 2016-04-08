package edu.ucla.library.libservices.scheduler.beans.model;

public class LibraryPrepper
{
  private String[] unitsIn;

  public LibraryPrepper()
  {
  }

  public void setUnitsIn( String[] unitsIn )
  {
    this.unitsIn = unitsIn;
  }

  public String getUnitsOut()
  {
    StringBuffer unitsOut;
    unitsOut = new StringBuffer(unitsIn[0]);
    
    for ( int i = 1; i < unitsIn.length; i++ )
      unitsOut.append(", " + unitsIn[ i ]);

    return unitsOut.toString();
  }
}
