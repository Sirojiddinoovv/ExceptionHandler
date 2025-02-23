package uz.nodir.exceptionhandler.controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.nodir.exceptionhandler.model.dto.core.request.ClientCardsRequestDTO;
import uz.nodir.exceptionhandler.service.CardService;

import java.util.List;

/**
 * @author: PC
 * @date: 23.02.2025
 * @group: DavrCoders
 **/

@RestController
@RequestMapping("/api/v1/test")
@RequiredArgsConstructor
public class TestController {
    private final CardService cardService;

    @PostMapping("/client/cards")
    public ResponseEntity<List<String>> getClientCards(@RequestBody @Valid ClientCardsRequestDTO requestDTO) {
        return ResponseEntity.ok(cardService.getClientCards(requestDTO));
    }

}
