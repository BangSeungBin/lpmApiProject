package lpm.api.msa.controller;



import lpm.api.msa.entity.request.ResponseLpmDto;
import lpm.api.msa.service.LpmIfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;




/**
 * FLUX (리스트)
 * MONO (단일)
 */

@RestController
public class LpmApiController {


    @GetMapping("/")
    public ResponseEntity<String> successMessage(){
        return new ResponseEntity<>("EC8MOBON", HttpStatus.OK);
    }

    @GetMapping("/{test}")
    @ResponseBody
    public Mono<ResponseEntity<ResponseLpmDto>> test(@PathVariable String test){
        ResponseLpmDto resDto = new ResponseLpmDto();
        resDto.setTest(test);

        return Mono.just(ResponseEntity.ok()
                .header("test_header", "test_values")
                .body(resDto)
        );
    }
}
