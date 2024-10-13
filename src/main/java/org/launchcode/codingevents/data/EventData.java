package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {

    //something to hold data
    private static Map<Integer, Event> events = new HashMap<>();

    //add data method
    public static void add(Event event){
        events.put(event.getId(),event);
    }

    //get one value
    public static Event getValue(Integer id){
        return events.get(id);
    }

    //get all values
    public static Collection<Event> getAll(){
        return events.values();
    }

    //remove
    public static void remove(Integer id) {
        if (events.containsKey(id)) {
            events.remove(id);
        }
    }
}
