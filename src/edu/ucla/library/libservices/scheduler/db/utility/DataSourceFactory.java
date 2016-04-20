package edu.ucla.library.libservices.scheduler.db.utility;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.naming.Context;

public class DataSourceFactory
{
  public static DriverManagerDataSource createDataSource()
  {
    DriverManagerDataSource ds;
    
    ds  = new DriverManagerDataSource();
    ds.setDriverClassName( "com.microsoft.jdbc.sqlserver.SQLServerDriver" );
    ds.setUrl( "url" );
    ds.setUsername( "user" );
    ds.setPassword( "pwd" );
    
    return ds;
  }
  public static DataSource createDataSource(String name)
  {
    Context envContext;
    InitialContext context;
    DataSource connection;
    
    try
    {
      context = new InitialContext();
      envContext = (Context)context.lookup("java:/comp/env");
      connection = ( DataSource ) envContext.lookup( name ); //( DataSource ) context.lookup( name );
    }
    catch ( NamingException e )
    {
      e.printStackTrace();
      connection = null;
    }
    
    return connection;
  }
}
