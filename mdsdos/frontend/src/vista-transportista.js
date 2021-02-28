import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-transportista`
 *
 * VistaTransportista element.
 *
 * @customElement
 * @polymer
 */
class VistaTransportista extends PolymerElement {

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
        return 'vista-transportista';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaTransportista.is, VistaTransportista);
