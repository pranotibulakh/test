/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mongodb.*;
        import com.mongodb.MongoClient;

public class Connect {
    int roll;
    public DBCollection connect(){
        try{
            MongoClient mc= new MongoClient("localhost",27017);
                    DB d = mc.getDB("Student");
                    DBCollection dbc= d.getCollection("studinfo");
                   
                    return dbc;
        } catch (Exception e){ return null;}
    }
    }