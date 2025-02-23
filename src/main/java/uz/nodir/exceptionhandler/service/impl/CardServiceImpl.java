package uz.nodir.exceptionhandler.service.impl;


import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import uz.nodir.exceptionhandler.exception.GeneralException;
import uz.nodir.exceptionhandler.model.dto.core.request.ClientCardsRequestDTO;
import uz.nodir.exceptionhandler.service.CardService;

import java.util.List;

/**
 * @author: PC
 * @date: 23.02.2025
 * @group: DavrCoders
 **/

@Service
@Slf4j
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {

    @Override
    public List<String> getClientCards(@NotNull ClientCardsRequestDTO requestDTO) {
        log.info("Received command to get client cards with requestDTO: {} ", requestDTO);

        if (!requestDTO.getClientId().matches("\\d+"))
            throw new GeneralException("Client ID is invalid");

        /*
          to do some business logic
         */

        return List.of();
    }
}
