package by.it.lanevich.project.java.controller;


import javax.servlet.http.HttpServletRequest;

abstract class Cmd {
    abstract Action execute(HttpServletRequest req)
            throws Exception;
}
