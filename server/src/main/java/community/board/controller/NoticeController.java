package community.board.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*공지사항 페이지*/
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/notice")
public class NoticeController {


}
