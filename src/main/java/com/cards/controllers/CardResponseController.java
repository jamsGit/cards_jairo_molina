package com.cards.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cards.models.Card;
import com.cards.models.CardResponse;

import io.reactivex.Single;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/core")
public class CardResponseController {

  @Value("${cardNumber}")
  String cardNumber;

  @GetMapping("/cards")
  public Single<CardResponse> getTarjeta(@RequestParam
          (value = "documentNumber") String documentNumber) {
    System.out.println("valor..:"+documentNumber);
    if (documentNumber.isEmpty()) {
      return null;
    }
    CardResponse cardResponse = new CardResponse();
    List<Card> listCard = new ArrayList<Card>();
    Arrays.asList(1, 2, 3, 4, 5, 6).stream().forEach(x -> {
    String numcard = cardNumber + x.toString();
    System.out.println("valor lista .:"+numcard);
      boolean activ = true;

      if (x > 3) {
        activ = false;
      }
      Card card = new Card(numcard, activ);
      listCard.add(card);
    });
    cardResponse.setCards(listCard);
   
    return Single.just(cardResponse);
  }
}
