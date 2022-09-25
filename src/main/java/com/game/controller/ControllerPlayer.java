package com.game.controller;

import com.game.service.ServicePlayer;
import com.game.service.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/players")
public class ControllerPlayer {

    private ServicePlayer service;

    @Autowired
    public ControllerPlayer(ServicePlayer service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getPlayer(@PathVariable String id){
        return new ResponseEntity<>(service.getPlayer(id), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<Object> getPlayerList(@ModelAttribute GetRequest request){

        return new ResponseEntity<>(service.getPlayers(request), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Object> createPlayer(@RequestBody CreateRequest newPlayerRequest){
        return new ResponseEntity<>(service.createNewPlayer(newPlayerRequest), HttpStatus.OK);
    }

    @PostMapping("/{id}")
    public ResponseEntity<Object> updatePlayer(@RequestBody UpdateRequest request,  @PathVariable String id){
        return new ResponseEntity<>(service.updatePlayer(request, id), HttpStatus.OK);
    }

    @GetMapping("/count")
    public ResponseEntity<Object> getCount( @ModelAttribute GetCountRequest request){
        return new ResponseEntity<>(service.getCount(request), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletePlayer(@PathVariable String id){
        service.deletePlayer(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
