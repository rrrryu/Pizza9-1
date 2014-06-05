package pizashop;

import java.net.URL;
import java.util.Date;

import javax.jdo.annotations.*;
 
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class LinkData {
	 @PrimaryKey
	    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	    private Long id;
	     
	    @Persistent
	    private String maisuu;
	     
	    @Persistent
	    private String maisuu1;
	     
	    @Persistent
	    private String maisuu2;
	    
	    @Persistent
	    private String maisuu3;
	     
	    @Persistent
	    private Date datetime;
	 
	    public LinkData(String maisuu, String maisuu1, String maisuu2, String maisuu3, Date datetime) {
	        super();
	        this.maisuu = maisuu;
	        this.maisuu1 = maisuu1;
	        this.maisuu2 = maisuu2;
	        this.maisuu3 = maisuu3;
	        
	        this.datetime = datetime;
	    }
	 

		public Long getId() {
	        return id;
	    }
	 
	    public void setId(Long id) {
	        this.id = id;
	    }
	 
	    public String getTitle() {
	        return maisuu;
	    }
	 
	    public void setTitle(String title) {
	        this.maisuu = title;
	    }
	    public String getTitle1() {
	        return maisuu1;
	    }
	 
	    public void setTitle1(String title) {
	        this.maisuu1 = title;
	    }
	 
	    public String getTitle2() {
	        return maisuu2;
	    }
	 
	    public void setTitle2(String title) {
	        this.maisuu2 = title;
	    }
	    public String getTitle3() {
	        return maisuu3;
	    }
	 
	    public void setTitle3(String title) {
	        this.maisuu3= title;
	    }
	   
	 
	    public Date getDatetime() {
	        return datetime;
	    }
	 
	    public void setDatetime(Date datetime) {
	        this.datetime = datetime;
	    }
}
