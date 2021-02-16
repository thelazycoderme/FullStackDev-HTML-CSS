package com.Mission.surgical_strike;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    private pokMap pokmap;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter coordintes of POKMap(latitude,longitude");
        pokMap pmap=new pokMap();
        pmap.setL1(sc.nextDouble());
        pmap.setL2(sc.nextDouble());

        Camp_Locations camp_locations=new Camp_Locations();
     //System.out.println("Its working...size is..lattidue, longitude is"+pmap.getL1()+pmap.getL2());

        //2.==============================>>>>>>>>>>>>>>>>
        //Inserting number of camps in the pokmap area.

        System.out.println("Number of terrorist camps in POK area");
        int no_of_camps=sc.nextInt();

        //creating a list of terrorist camps

        List<Camp_Locations> terror_camp_list=new ArrayList<>();
        //taking inputs one by one

        for(int i=0;i<no_of_camps;i++)
        {
            System.out.println("Enter Terrorist Camp Locations(latitude,longitude,radius)");
            long lat=sc.nextLong();
            long longi=sc.nextLong();
            float radii=sc.nextFloat();
          terror_camp_list.add(new Camp_Locations(lat,longi,radii));
        }

        System.out.println("Inputed camp locations  are");
        for(Camp_Locations cmp : terror_camp_list)
        {
            System.out.println(cmp);
        }
    }
}
