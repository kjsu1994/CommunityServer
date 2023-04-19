package community.chatgpt.controller;

import com.nimbusds.oauth2.sdk.http.HTTPRequest;
import community.chatgpt.dto.ChatGptDto;
import community.chatgpt.service.ChatGptService;
import lombok.RequiredArgsConstructor;
import org.apache.http.protocol.HTTP;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/gpt")
@Validated
public class ChatGptController {
    private final ChatGptService chatGptService;

    /*
     * # ChatGPT 질문
     *
     */
    @PostMapping("/question")
    public ResponseEntity<?> sendQuestion(@Valid @RequestBody ChatGptDto.Post requestBody) {
        ChatGptDto.Response response = chatGptService.askQuestion(requestBody.getQuestion());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
