package uz.nodir.exceptionhandler.service;


import jakarta.validation.constraints.NotNull;
import uz.nodir.exceptionhandler.model.dto.core.request.ClientCardsRequestDTO;

import java.util.List;

/**
 * @author: PC
 * @date: 23.02.2025
 * @group: DavrCoders
 **/
public interface CardService {
    List<String> getClientCards(@NotNull ClientCardsRequestDTO requestDTO);
}
