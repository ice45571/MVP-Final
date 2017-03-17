package com.example.ice.u17.bean;

import com.example.ice.u17.base.BaseBean;

import java.util.List;

/**
 * Created by ice on 17/3/17.
 * ice is a big cow?
 */

public class BoutiqueListNewBean implements BaseBean{
    private String editTime;
    private List<GalleryItemsBean> galleryItems;
    private List<?> textItems;
    private List<ComicListsBean> comicLists;

    public String getEditTime() {
        return editTime;
    }

    public void setEditTime(String editTime) {
        this.editTime = editTime;
    }

    public List<GalleryItemsBean> getGalleryItems() {
        return galleryItems;
    }

    public void setGalleryItems(List<GalleryItemsBean> galleryItems) {
        this.galleryItems = galleryItems;
    }

    public List<?> getTextItems() {
        return textItems;
    }

    public void setTextItems(List<?> textItems) {
        this.textItems = textItems;
    }

    public List<ComicListsBean> getComicLists() {
        return comicLists;
    }

    public void setComicLists(List<ComicListsBean> comicLists) {
        this.comicLists = comicLists;
    }

    public static class GalleryItemsBean {
        private int linkType;
        private String cover;
        private int id;
        private String title;
        private String content;
        private int isSpecial;
        private List<ExtBean> ext;

        public int getLinkType() {
            return linkType;
        }

        public void setLinkType(int linkType) {
            this.linkType = linkType;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public int getIsSpecial() {
            return isSpecial;
        }

        public void setIsSpecial(int isSpecial) {
            this.isSpecial = isSpecial;
        }

        public List<ExtBean> getExt() {
            return ext;
        }

        public void setExt(List<ExtBean> ext) {
            this.ext = ext;
        }

        public static class ExtBean {

            private String key;
            private String val;

            public String getKey() {
                return key;
            }

            public void setKey(String key) {
                this.key = key;
            }

            public String getVal() {
                return val;
            }

            public void setVal(String val) {
                this.val = val;
            }
        }
    }

    public static class ComicListsBean {

        private int comicType;
        private String titleIconUrl;
        private String newTitleIconUrl;
        private String description;
        private String itemTitle;
        private String argName;
        private int argValue;
        private int argType;
        private List<ComicsBean> comics;

        public int getComicType() {
            return comicType;
        }

        public void setComicType(int comicType) {
            this.comicType = comicType;
        }

        public String getTitleIconUrl() {
            return titleIconUrl;
        }

        public void setTitleIconUrl(String titleIconUrl) {
            this.titleIconUrl = titleIconUrl;
        }

        public String getNewTitleIconUrl() {
            return newTitleIconUrl;
        }

        public void setNewTitleIconUrl(String newTitleIconUrl) {
            this.newTitleIconUrl = newTitleIconUrl;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getItemTitle() {
            return itemTitle;
        }

        public void setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
        }

        public String getArgName() {
            return argName;
        }

        public void setArgName(String argName) {
            this.argName = argName;
        }

        public int getArgValue() {
            return argValue;
        }

        public void setArgValue(int argValue) {
            this.argValue = argValue;
        }

        public int getArgType() {
            return argType;
        }

        public void setArgType(int argType) {
            this.argType = argType;
        }

        public List<ComicsBean> getComics() {
            return comics;
        }

        public void setComics(List<ComicsBean> comics) {
            this.comics = comics;
        }

        public static class ComicsBean {

            private int comicId;
            private String name;
            private String cover;
            private String description;
            private String cornerInfo;
            private String short_description;
            private String author_name;
            private int is_vip;

            public int getComicId() {
                return comicId;
            }

            public void setComicId(int comicId) {
                this.comicId = comicId;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getCornerInfo() {
                return cornerInfo;
            }

            public void setCornerInfo(String cornerInfo) {
                this.cornerInfo = cornerInfo;
            }

            public String getShort_description() {
                return short_description;
            }

            public void setShort_description(String short_description) {
                this.short_description = short_description;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public int getIs_vip() {
                return is_vip;
            }

            public void setIs_vip(int is_vip) {
                this.is_vip = is_vip;
            }
        }
    }

}
