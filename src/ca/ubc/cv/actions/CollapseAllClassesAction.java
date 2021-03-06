package ca.ubc.cv.actions;

import java.net.URL;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.internal.util.BundleUtility;
import org.osgi.framework.Bundle;

import ca.ubc.cv.views.CouplingVisualizerView;

public class CollapseAllClassesAction extends Action {

	public CollapseAllClassesAction() {
		setToolTipText("Collapse All");
		Bundle bundle = Platform.getBundle("CouplingVisualizer");
		URL fullPathString = BundleUtility.find(bundle, "icons/collapse.png");
		setImageDescriptor(ImageDescriptor.createFromURL(fullPathString));
	}

	@Override
	public void run() {
		CouplingVisualizerView.mngc.collaspseAllWindows();
	}
}