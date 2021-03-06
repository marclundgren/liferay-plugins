/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.sync.engine.documentlibrary.handler;

import com.liferay.sync.engine.documentlibrary.event.Event;
import com.liferay.sync.engine.model.SyncFile;
import com.liferay.sync.engine.service.SyncFileService;
import com.liferay.sync.engine.util.FilePathNameUtil;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Shinn Lok
 */
public class BaseSyncDLObjectHandler extends BaseJSONHandler {

	public BaseSyncDLObjectHandler(Event event) {
		super(event);
	}

	protected void processFilePathChange(
			SyncFile sourceSyncFile, SyncFile targetSyncFile)
		throws Exception {

		String targetSyncFileName = targetSyncFile.getName();

		if (sourceSyncFile.getParentFolderId() !=
				targetSyncFile.getParentFolderId()) {

			SyncFile targetParentSyncFile = SyncFileService.fetchSyncFile(
				targetSyncFile.getRepositoryId(), getSyncAccountId(),
				targetSyncFile.getParentFolderId());

			Path targetParentFilePath = Paths.get(
				targetParentSyncFile.getFilePathName());

			Path targetFilePath = targetParentFilePath.resolve(
				targetSyncFileName);

			Files.move(
				Paths.get(sourceSyncFile.getFilePathName()), targetFilePath);

			sourceSyncFile.setFilePathName(
				FilePathNameUtil.getFilePathName(targetFilePath));
			sourceSyncFile.setName(targetSyncFileName);
		}
		else if (!targetSyncFileName.equals(sourceSyncFile.getName())) {
			Path sourceSyncFilePath = Paths.get(
				sourceSyncFile.getFilePathName());

			Path targetFilePath = sourceSyncFilePath.resolveSibling(
				targetSyncFileName);

			Files.move(
				Paths.get(sourceSyncFile.getFilePathName()), targetFilePath);

			sourceSyncFile.setFilePathName(
				FilePathNameUtil.getFilePathName(targetFilePath));
			sourceSyncFile.setName(targetSyncFileName);
		}
	}

}