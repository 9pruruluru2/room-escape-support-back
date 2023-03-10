package com.example.roomescapesupportback.controller;

import com.example.roomescapesupportback.model.DTO.FilterOption;
import com.example.roomescapesupportback.model.DTO.ThemeWithDate;
import com.example.roomescapesupportback.service.OpenTimeService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OpenTimeController {

  private final OpenTimeService openTimeService;


  @PostMapping(value = "/openTimeThemeList", produces = "application/json")
  public ResponseEntity<List<ThemeWithDate>> getOpenTimeThemeList(
      @RequestBody @Nullable FilterOption filterOption) {
    return ResponseEntity.ok(openTimeService.getThemeOpenTimeList(filterOption));
  }

  @GetMapping("/allThemeList")
  public ResponseEntity<List<ThemeWithDate>> getAllThemeList() {
    return ResponseEntity.ok(openTimeService.getAllThemeList());
  }
}
