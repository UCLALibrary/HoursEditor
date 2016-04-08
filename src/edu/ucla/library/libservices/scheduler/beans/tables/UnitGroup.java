package edu.ucla.library.libservices.scheduler.beans.tables;

public class UnitGroup
{
  private int unit_group_id;
  private String unit_group_title;

  public UnitGroup()
  {
  }

  public void setUnit_group_id( int unit_group_id )
  {
    this.unit_group_id = unit_group_id;
  }

  public int getUnit_group_id()
  {
    return unit_group_id;
  }

  public void setUnit_group_title( String unit_group_title )
  {
    this.unit_group_title = unit_group_title;
  }

  public String getUnit_group_title()
  {
    return unit_group_title;
  }
}
