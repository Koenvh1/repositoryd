package net.apnic.rpki.rsync;

/**
 * A Module is a set of files to be served by a Protocol object. The Module interface
 * provides a layer of abstraction over the source of files.
 *
 * A Module will issue a notifyAll() on itself whenever its content has been updated, should other threads wish to
 * wait() on the Module.
 */
public interface Module {
    /**
     * Gets the name of this Module.
     *
     * @return the name of this Module
     * @since 0.9
     */
    public String getName();

    /**
     * Gets the description of this Module.
     *
     * @return the description of this Module.
     * @since 0.9
     */
    public String getDescription();

    /**
     * Returns true if the Module can be used by a sending rsync.
     *
     * @return true if the Module can be used by a sending rsync
     * @since 2.0
     */
    public boolean isReadable();

    /**
     * Returns true if the Module can be used by a receiving rsync.
     *
     * @return true if the Module can be used by a receiving rsync
     * @since 2.0
     */
    public boolean isWritable();
}
