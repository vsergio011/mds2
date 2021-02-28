import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-ofertaspopulares`
 *
 * VistaOfertaspopulares element.
 *
 * @customElement
 * @polymer
 */
class VistaOfertaspopulares extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-ofertaspopulares';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaOfertaspopulares.is, VistaOfertaspopulares);
