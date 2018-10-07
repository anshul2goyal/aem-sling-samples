/**
 * 
 */
package ie.cq.sling.projects.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.ExporterOption;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;

/**
 * @author anshulgoyal
 *
 */
@Model(adaptables = Resource.class, resourceType = {
		"aemsling/components/content/staffapp" }, 
		defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

@Exporter(name="jackson", extensions="json", 
options= {@ExporterOption(name = "SerializationFeature.WRITE_DATES_AS_TIMESTAMPS", value = "true") })

public class StaffAppModel {

	@Inject
	@Optional
	private String title;

	@Inject
	@Optional
	private String fileReference;

	@Inject
	@Optional
	private String heading;
	
	@Inject
    String description;
	
	@Inject
	String buttonLinkTo;
 
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the fileReference
	 */
	public String getFileReference() {
		return fileReference;
	}

	/**
	 * @param fileReference the fileReference to set
	 */
	public void setFileReference(String fileReference) {
		this.fileReference = fileReference;
	}

	/**
	 * @return the heading
	 */
	public String getHeading() {
		return heading;
	}

	/**
	 * @param heading the heading to set
	 */
	public void setHeading(String heading) {
		this.heading = heading;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the buttonLinkTo
	 */
	public String getButtonLinkTo() {
		return buttonLinkTo;
	}

	/**
	 * @param buttonLinkTo the buttonLinkTo to set
	 */
	public void setButtonLinkTo(String buttonLinkTo) {
		this.buttonLinkTo = buttonLinkTo;
	}
}