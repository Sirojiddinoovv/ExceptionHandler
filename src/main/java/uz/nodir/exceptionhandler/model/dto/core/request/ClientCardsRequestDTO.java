package uz.nodir.exceptionhandler.model.dto.core.request;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: PC
 * @date: 23.02.2025
 * @group: DavrCoders
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientCardsRequestDTO {

    @NotBlank
    @JsonProperty("client_id")
    private String clientId;
}
