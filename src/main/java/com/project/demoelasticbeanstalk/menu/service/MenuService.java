package com.project.demoelasticbeanstalk.menu.service;

import com.project.demoelasticbeanstalk.menu.dto.MenuDto;
import com.project.demoelasticbeanstalk.menu.entity.Menu;
import com.project.demoelasticbeanstalk.menu.repository.MenuRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class MenuService {

  private final MenuRepository menuRepository;

  public List<MenuDto> getAllMenus() {

    List<Menu> menus = menuRepository.findAll();

    List<MenuDto> menuDtos = menus.stream().map(MenuDto::new).collect(Collectors.toList());

    return menuDtos;
  }
}
