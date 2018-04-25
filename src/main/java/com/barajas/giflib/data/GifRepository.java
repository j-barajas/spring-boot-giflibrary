package com.barajas.giflib.data;

import com.barajas.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jbara on 4/24/2018.
 */

@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", LocalDate.of(2018,2,13),"Chris Redban", false),
            new Gif("ben-and-mike", LocalDate.of(2018,2,13),"Ben Jakuben", true),
            new Gif("book-dominos", LocalDate.of(2018,10,30),"Craig Dennis", false),
            new Gif("compiler-bot", LocalDate.of(2018,9,13),"Ada Lovelace", true),
            new Gif("cowboy-coder", LocalDate.of(2018,2,13),"Grace Hopper", false),
            new Gif("infinite-andrew", LocalDate.of(2018,2,13),"Alan Turing", true)
    );


    public Gif findByName(String name){
        for (Gif gif:ALL_GIFS) {
            if(gif.getName().equals(name))
                return gif;
        }
        return null;
    }

    public List<Gif> getAllGifs(){
        return ALL_GIFS;
    }
}
