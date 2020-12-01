package com.tradeify.tradeify_ws.file.vm;

import com.tradeify.tradeify_ws.file.FileAttachment;

import lombok.Data;

@Data
public class FileAttachmentVM {

	private String name;
	
	private String fileType;

	public FileAttachmentVM(FileAttachment fileAttachment) {
		this.setName(fileAttachment.getName());
		this.setFileType(fileAttachment.getFileType());
	}
}