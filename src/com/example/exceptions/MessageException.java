package com.example.exceptions;

import java.util.Map;

public interface MessageException {
	 String getExceptionKey();
	 Map<String, Object> getMapDetails();
}
