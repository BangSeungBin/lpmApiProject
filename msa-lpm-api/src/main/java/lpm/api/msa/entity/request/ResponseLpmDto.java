package lpm.api.msa.entity.request;

import lombok.Data;




/**
 * Inner클래스로 Request 전용 엔티티를 생성하자.. 여러개되면 개짱남
 */

@Data
public class ResponseLpmDto{
    private String test;
}


//추상화?
class ErrorResponse{
    private String errorMessage;
    public ErrorResponse(String errorMessage){
        this.errorMessage = errorMessage;
    }
}
