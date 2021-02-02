package pl.krystian.security;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class QuotationApi {

    private List<Quotation> quotation;

    public QuotationApi() {
        this.quotation = new ArrayList<>();
        quotation.add(new Quotation("To, że milczę, nie znaczy, że nie mam nic do powiedzenia.\n" +
                "\n", "Jonathan Carroll"));
        quotation.add(new Quotation("W chwili, kiedy zastanawiasz się czy kogoś kochasz, przestałeś go już kochać na zawsze.", "Carlos Ruiz Zafon"));
    }

    @GetMapping
    public ResponseEntity<?> getQuotation() {
        return new ResponseEntity<>(quotation, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> addQuotation(@RequestBody Quotation quotation){
        this.quotation.add(quotation);
        return new ResponseEntity<>(quotation,HttpStatus.ACCEPTED);
    }

    @DeleteMapping
    public void delQuotation(@RequestParam int index){
        quotation.remove(index);
    }

}
