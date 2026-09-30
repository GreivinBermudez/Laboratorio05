module lab.flotavehicular {
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens lab.flotavehicular.controller to javafx.fxml;

    exports lab.flotavehicular;
    exports lab.flotavehicular.model;
    exports lab.flotavehicular.dto;
    exports lab.flotavehicular.factory;
    exports lab.flotavehicular.repository;
    exports lab.flotavehicular.service;
}