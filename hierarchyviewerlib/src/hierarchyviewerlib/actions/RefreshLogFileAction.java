/*
 * Copyright (c) Shanghai Zhiping Technology Co.,Limited
 * Author: Binhua Liu
 * Web Site: www.vowei.com
 * License: GPL v3 (http://www.gnu.org/copyleft/gpl.html)
 */

package hierarchyviewerlib.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;

import hierarchyviewerlib.common.CustomString;
import hierarchyviewerlib.common.IConManager;
import hierarchyviewerlib.models.LogFileModel;

public class RefreshLogFileAction extends Action {
	//private final IWorkbenchWindow window;
	
	public RefreshLogFileAction()
	{
		setText(CustomString.getString("ACTION_REFRESH_PLIST"));
		setId(ICommandIds.CMD_REFRESH_LOG_FILE);
        // Associate the action with a pre-defined command, to allow key bindings.
        setActionDefinitionId(ICommandIds.CMD_REFRESH_LOG_FILE);
        setImageDescriptor(ImageDescriptor.createFromImage(IConManager.REFRESH_BLUE));
	}

	@Override
	public void run() {	
		LogFileModel.getModel().refreshLogFile();
	}
}
