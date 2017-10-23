package com.darksci.kafka.webview.controller.configuration;

import com.darksci.kafka.webview.controller.BaseController;
import com.darksci.kafka.webview.manager.ui.BreadCrumbManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/configuration")
public class ConfigurationController extends BaseController {
    /**
     * GET Displays main configuration index.
     */
    @RequestMapping(path = "", method = RequestMethod.GET)
    public String index(final Model model) {
        // Setup breadcrumbs
        new BreadCrumbManager(model)
            .addCrumb("Configuration", null);

        return "configuration/index";
    }
}