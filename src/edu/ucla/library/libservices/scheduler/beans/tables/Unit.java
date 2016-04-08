package edu.ucla.library.libservices.scheduler.beans.tables;

public class Unit
{
  private int unit_id;
  private String unit_code;
  private int unit_group;
  private String unit_title;
  private int sort_order;
  private String phone;

  public Unit()
  {
  }

  public void setUnit_id( int unit_id )
  {
    this.unit_id = unit_id;
  }

  public int getUnit_id()
  {
    return unit_id;
  }

  public void setUnit_code( String unit_code )
  {
    this.unit_code = unit_code;
  }

  public String getUnit_code()
  {
    return unit_code;
  }

  public void setUnit_group( int unit_group )
  {
    this.unit_group = unit_group;
  }

  public int getUnit_group()
  {
    return unit_group;
  }

  public void setUnit_title( String unit_title )
  {
    this.unit_title = unit_title;
  }

  public String getUnit_title()
  {
    return unit_title;
  }

  public void setSort_order( int sort_order )
  {
    this.sort_order = sort_order;
  }

  public int getSort_order()
  {
    return sort_order;
  }

  public void setPhone( String phone )
  {
    this.phone = phone;
  }

  public String getPhone()
  {
    return phone;
  }
}
