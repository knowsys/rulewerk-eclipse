package rls4eclipse.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

import rls4eclipse.ui.wizards.SampleNewWizard;

public class CreateFileHandler extends AbstractHandler {
	int i = 0;

	public Object execute(ExecutionEvent event) throws ExecutionException {

		Shell activeShell = HandlerUtil.getActiveShell(event);

		IWizard wizard = new SampleNewWizard();

		WizardDialog dialog = new WizardDialog(activeShell, wizard);

		dialog.open();

		return null;
	}

}
