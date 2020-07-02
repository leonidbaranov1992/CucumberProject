
package models;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Pet implements Serializable {

    private Category mCategory;
    private Long mId;
    private String mName;
    private List<String> mPhotoUrls;
    private String mStatus;
    private List<Tag> mTags;

    public Category getCategory() {
        return mCategory;
    }

    public void setCategory(Category category) {
        mCategory = category;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public List<String> getPhotoUrls() {
        return mPhotoUrls;
    }

    public void setPhotoUrls(List<String> photoUrls) {
        mPhotoUrls = photoUrls;
    }

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(String status) {
        mStatus = status;
    }

    public List<Tag> getTags() {
        return mTags;
    }

    public void setTags(List<Tag> tags) {
        mTags = tags;
    }

}
