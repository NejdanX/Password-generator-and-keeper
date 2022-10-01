package com.nejdangroup.pgk.views;

import com.nejdangroup.pgk.models.User;
import com.nejdangroup.pgk.services.interfaces.UserService;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route
public class MainView extends VerticalLayout {

    private final UserService userService;
    final Grid<User> grid;

    @Autowired
    public MainView(UserService userService) {
        this.userService = userService;
        this.grid = new Grid<>(User.class);
        add(grid);
        listCustomers();
        add(new Button("Click me", e -> Notification.show("Hello, Spring+Vaadin user!")));
    }

    private void listCustomers() {
        grid.setItems(userService.getAllUsers());
    }
}
