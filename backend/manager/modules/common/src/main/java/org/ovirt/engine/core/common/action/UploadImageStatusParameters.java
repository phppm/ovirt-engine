package org.ovirt.engine.core.common.action;

import org.ovirt.engine.core.common.AuditLogType;
import org.ovirt.engine.core.common.businessentities.storage.ImageTransfer;
import org.ovirt.engine.core.compat.Guid;

public class UploadImageStatusParameters extends VdcActionParametersBase {
    private static final long serialVersionUID = 8404863745376386682L;
    private Guid uploadImageCommandId;
    private Guid diskId;
    private ImageTransfer updates;
    private AuditLogType auditLogType;

    public UploadImageStatusParameters(Guid uploadImageCommandId, ImageTransfer updates) {
        this.uploadImageCommandId = uploadImageCommandId;
        this.updates = updates;
    }

    public UploadImageStatusParameters(Guid uploadImageCommandId) {
        this.uploadImageCommandId = uploadImageCommandId;
    }

    public UploadImageStatusParameters() {
    }

    public Guid getUploadImageCommandId() {
        return uploadImageCommandId;
    }

    public void setUploadImageCommandId(Guid uploadImageCommandId) {
        this.uploadImageCommandId = uploadImageCommandId;
    }

    public Guid getDiskId() {
        return diskId;
    }

    public void setDiskId(Guid diskId) {
        this.diskId = diskId;
    }

    public ImageTransfer getUpdates() {
        return updates;
    }

    public void setUpdates(ImageTransfer updates) {
        this.updates = updates;
    }

    public void setAuditLogType(AuditLogType logType) {
        this.auditLogType = logType;
    }

    public AuditLogType getAuditLogType() {
        return auditLogType;
    }
}
