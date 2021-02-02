package pl.krystian.security;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Quotation {
    private String content;
    private String author;
}
