import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-agregaroferta`
 *
 * VistaAgregaroferta element.
 *
 * @customElement
 * @polymer
 */
class VistaAgregaroferta extends PolymerElement {

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
        return 'vista-agregaroferta';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAgregaroferta.is, VistaAgregaroferta);
