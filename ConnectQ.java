
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pranoti
 */
public class ConnectQ {
    public DBCollection connectq(){
        try{
            MongoClient mc= new MongoClient("localhost",27017);
                    DB d = mc.getDB("Student");
                    DBCollection dbcq= d.getCollection("Questions");
                   
                    return dbcq;
        } catch (Exception e){ return null;}
    }
    
}
