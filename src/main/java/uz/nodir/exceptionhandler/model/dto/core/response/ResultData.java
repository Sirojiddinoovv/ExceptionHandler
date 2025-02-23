package uz.nodir.exceptionhandler.model.dto.core.response;


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
public class ResultData {
    private Integer code;
    private String message;
}
