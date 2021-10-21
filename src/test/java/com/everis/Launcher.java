package com.everis;

import java.util.ArrayList;
import java.util.stream.Collectors;

import org.junit.platform.engine.discovery.DiscoverySelectors;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;

import com.everis.utils.Constant;
import com.everis.utils.Utils;
import com.everis.report.Report;

public class Launcher {

	public static Constant constant = new Constant();

	public static void main(String[] args) {
		
		try {
			ArrayList<String> testCases = Utils.getTestCasesSelected();

			LauncherDiscoveryRequest discoveryRequest = LauncherDiscoveryRequestBuilder.request()
					.selectors(testCases.stream().map(DiscoverySelectors::selectClass).collect(Collectors.toList()))
					.build();
			
			org.junit.platform.launcher.Launcher launcher = LauncherFactory.create();
			launcher.execute(discoveryRequest);

		} catch (Exception e) {
			Report.reportErrors(e.getMessage());
		}
	}

}